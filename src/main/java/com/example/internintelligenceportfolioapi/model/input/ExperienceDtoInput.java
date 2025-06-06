package com.example.internintelligenceportfolioapi.model.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExperienceDtoInput {
    private String workPlace;
    private String jobTitle;
    private LocalDate startDate;
    private LocalDate endDate;
}
