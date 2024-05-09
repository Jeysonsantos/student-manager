package com.academy.edge.studentmanager.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCreateDTO {
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    @NotNull
    private Integer workload;
}
