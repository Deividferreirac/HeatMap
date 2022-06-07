package com.example.Heatmap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.File;
import java.io.IOException;

@RestController
public class TesteHeatMap {


    @GetMapping("/teste")
    public void teste ()throws IOException {
        double[][] data = new double[][]
                {
                    {6, 2, 6, 6, 6, 6},
                    {4, 5, 6, 7, 6, 4},
                    {2, 3, 4, 5, 6, 4},
                    {4, 5, 6, 7, 6, 3},
                    {3, 2, 3, 6, 2, 2},
                    {2, 4, 5, 4, 2, 4},
                    {3, 4, 5, 3, 2, 2},
                    {2, 5, 7, 6, 5, 2},
                    {5, 7, 6, 6, 7, 2},
                    {4, 5, 6, 7, 6, 2}
                };

        // Passo 1: Criar nosso gráfico de map de color usando nossos dados.
        org.tc33.jheatchart.HeatChart chart = new org.tc33.jheatchart.HeatChart(data);


        chart.setTitle("HEAT MAP TESLA");
        chart.setXAxisLabel("X - FATURAMENTO ");
        chart.setYAxisLabel("Y - ULTIMOS 10 ANOS");
        chart.saveToFile(new File("HeatMapTesla.png"));
    }
}
