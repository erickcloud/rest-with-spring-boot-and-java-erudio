package br.com.erickcloud.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
