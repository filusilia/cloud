package com.service.feign.service.hystric;

import com.service.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Aozaki on 2018/11/7.
 * @version 1.0
 * @since 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println("出错了 sorry");
        return "sorry feign error";
    }
}
