package com.example.apaspringboot.controller;

import com.example.report.api.ReportsApi;
import com.example.report.model.GenerateReportRequest;
import com.example.report.model.GenerateReportResponse;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController implements ReportsApi {

    @Override
    public ResponseEntity<GenerateReportResponse> generateReport(GenerateReportRequest generateReportRequest) {
       GenerateReportResponse report = new GenerateReportResponse();
       report.setDocument(null);
       report.addSourcesItem(null);
       report.setReportId(new UUID(0, 0));
       report.setSources(null);
        return ResponseEntity.ok(report);
    }
}
