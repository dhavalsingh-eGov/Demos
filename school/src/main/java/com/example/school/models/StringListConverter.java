package com.example.school.models;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<ArrayList<String>, String> {

    @Override
    public String convertToDatabaseColumn(ArrayList<String> list) {
        // Java 8
        return String.join(",", list);
    }

    @Override
    public ArrayList<String> convertToEntityAttribute(String joined) {
        return new ArrayList<>(Arrays.asList(joined.split(",")));
    }

}