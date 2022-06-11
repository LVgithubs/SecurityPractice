package security.practice.securityspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // view를 리턴하겠다. < MVC 패턴!
public class IndexController {

    // localhost:L8080/
    @GetMapping({ "/", "" })
    public String index() {
        // 머스테치 기본폴더 src/main/resource
        // 뷰 리졸버 설정 : templates(prefix), .mustache (suffix) 생략가능!!
        return "index"; // src/main/resource
    }
}
