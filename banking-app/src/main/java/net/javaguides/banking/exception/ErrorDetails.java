package net.javaguides.banking.exception;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime Timestamp,
                           String message,
                           String details,
                           String errorCode) {
}
