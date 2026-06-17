package Validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class TutorValidator {
    public static String getValidationError(String field, String value) {
        if (value == null || value.trim().isEmpty()) {
            return field.substring(0, 1).toUpperCase() + field.substring(1) + " cannot be empty.";
        }
        value = value.trim();
        switch (field.toLowerCase()) {
            case "staffno":
                if (!Pattern.matches("^\\d+$", value)) {
                    return "Staff No must be a valid number.";
                }
                break;
            case "firstname":
                if (!Pattern.matches("^[A-Za-z\\s'\\-]+$", value)) {
                    return "First Name must contain only letters, spaces, hyphens, or apostrophes.";
                }
                break;
            case "lastname":
                if (!Pattern.matches("^[A-Za-z\\s'\\-]+$", value)) {
                    return "Last Name must contain only letters, spaces, hyphens, or apostrophes.";
                }
                break;
            case "address":
                if (value.length() < 5) {
                    return "Address must be at least 5 characters long.";
                }
                break;
            case "email":
                if (!Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", value)) {
                    return "Email must be a valid email address.";
                }
                break;
            case "dateemployed":
                try {
                    LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE);
                } catch (DateTimeParseException e) {
                    return "Date Employed must be a valid calendar date in YYYY-MM-DD format (e.g., 2026-06-15).";
                }
                break;
        }
        return "";
    }
}
