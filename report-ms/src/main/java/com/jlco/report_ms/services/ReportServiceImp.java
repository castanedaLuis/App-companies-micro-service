package com.jlco.report_ms.services;

import com.jlco.report_ms.repositories.CompaniesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ReportServiceImp implements ReportService{

    private final CompaniesRepository companiesRepository;

    @Override
    public String makeReport(String name) {

        return  companiesRepository.getByName(name).orElseThrow().getName();
    }

    @Override
    public String saveReport(String nameReport) {
        return "";
    }

    @Override
    public void deleteReport(String name) {

    }
}
