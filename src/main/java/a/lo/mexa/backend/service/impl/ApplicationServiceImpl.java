package a.lo.mexa.backend.service.impl;

import a.lo.mexa.backend.service.ApplicationService;
import a.lo.mexa.backend.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    HttpService httpService;
}
