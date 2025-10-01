package com.example.job_platform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.job_platform.DTO.AnalysticsResponse;
import com.example.job_platform.Service.AnalyticsService;



@RestController
@RequestMapping("/api/analystics")
public class AnalyticsController {
	
	@Autowired
	private AnalyticsService analyticsService;
	
	@GetMapping("/summery")
	public ResponseEntity<AnalysticsResponse> getSummey(){
	return ResponseEntity.ok(analyticsService.collectData());
	}

}
