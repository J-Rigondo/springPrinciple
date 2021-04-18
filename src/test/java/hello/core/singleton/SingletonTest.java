package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName(" 스프링 없는 di컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("S1 = " + memberService1);
        System.out.println("S2 = " + memberService2);

        assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("singleton 적용 객체사용")
    void singletonServiceTest() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("S1 = " + singleton1);
        System.out.println("S2 = " +singleton2);

        assertThat(singleton1).isSameAs(singleton2);
    }
}
