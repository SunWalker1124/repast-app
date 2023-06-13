package com.rz.repast.fallback;

import com.rz.repast.model.LoginLog;
import com.rz.repast.model.Member;
import com.rz.repast.service.IRepastService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

/**
 * @description:
 * @author: Joe Wang
 * @date: 2020-03-11
 */
@Component
public class RepastFallBackFactory implements FallbackFactory<IRepastService> {
    @Override
    public IRepastService create(Throwable throwable) {
        IRepastService iRepastService =new IRepastService() {
            @Override
            public Member doLogin(Member member) {
                return null;
            }

            @Override
            public Boolean addLoginLog(LoginLog loginLog) {
                return null;
            }

            @Override
            public Integer updateUsername(Member member) {
                return null;
            }

            @Override
            public Boolean loginOut(String token) {
                return null;
            }

            @Override
            public HashMap selectByKeyMember(long key) {
                return null;
            }

            @Override
            public Boolean updateMember(Member member) {
                return null;
            }

            @Override
            public Boolean uploadFile(MultipartFile file, String token) {
                return null;
            }

            @Override
            public Boolean checkToken2(String token) {
                return null;
            }
        };
        return null;
    }
}
