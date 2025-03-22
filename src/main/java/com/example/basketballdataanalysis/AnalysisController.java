package com.example.basketballdataanalysis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class AnalysisController {

    @GetMapping("/analyze")
    public String analyzeData(@RequestParam String player) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/main/python/analyze.py", player);
            Process p = pb.start();

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String output = in.readLine();
            return output;
        } catch (Exception e) {
            e.printStackTrace();
            return "Error processing the request";
        }
    }
}
