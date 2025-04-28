package com.robotfactory.Robotic.System.Model;

import org.springframework.stereotype.Component;
import java.text.DecimalFormat;

@Component
public class DecimalFormatterService {
    private final DecimalFormat currencyFormatter;

    public DecimalFormatterService(DecimalFormat currencyFormatter) {
        this.currencyFormatter = currencyFormatter;
    }

    public String format(double amount){
        return currencyFormatter.format(amount);
    }
}
