package com.jlco.report_ms.services;

import com.jlco.report_ms.helpers.ReportHelper;
import com.jlco.report_ms.models.Company;
import com.jlco.report_ms.repositories.CompaniesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ReportServiceImp implements ReportService{

    private final CompaniesRepository companiesRepository;
    private final ReportHelper reportHelper;

    @Override
    public String makeReport(String name) {
        return reportHelper.readTemplate(companiesRepository.getByName(name).orElseThrow());
    }

    @Override
    public String saveReport(String report) {

        var company = Company.builder()
                .name("TEST")
                .foundationDate(LocalDate.now())
                .founder("test")
                .webSites(List.of())
                .build();

        this.companiesRepository.postByName(company);

        return null;
    }


    @Override
    public void deleteReport(String name) {
        this.companiesRepository.deleteByName(name);
    }

    private String makeReportMain(String name) {
        return reportHelper.readTemplate(this.companiesRepository.getByName(name).orElseThrow());
    }

}
