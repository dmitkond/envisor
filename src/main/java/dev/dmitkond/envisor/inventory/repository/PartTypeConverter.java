package dev.dmitkond.envisor.inventory.repository;

import dev.dmitkond.envisor.inventory.PartType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PartTypeConverter implements AttributeConverter<PartType, String> {
    @Override
    public String convertToDatabaseColumn(PartType partType) {
        return switch (partType) {
            case PURCHASED -> "P";
            case MANUFACTURED -> "M";
        };
    }

    @Override
    public PartType convertToEntityAttribute(String s) {
        return switch (s) {
            case "P" -> PartType.PURCHASED;
            case "M" -> PartType.MANUFACTURED;
            default -> throw new IllegalArgumentException("Unexpected value: " + s);
        };
    }
}
