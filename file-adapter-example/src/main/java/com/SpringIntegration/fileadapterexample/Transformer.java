package com.SpringIntegration.fileadapterexample;

import org.springframework.stereotype.*;

import java.io.*;
import java.nio.file.*;


@Component
public class Transformer {

    public String transform(String filePath) throws IOException {
                 String content= new String(Files.readAllBytes(
                Paths.get(filePath)));
                return "Transformed " + content ;
    }
}
