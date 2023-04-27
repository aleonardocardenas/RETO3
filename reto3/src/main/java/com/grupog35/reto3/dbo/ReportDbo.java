package com.grupog35.reto3.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDbo {
    private int completed;
    private int cancelled;
}
