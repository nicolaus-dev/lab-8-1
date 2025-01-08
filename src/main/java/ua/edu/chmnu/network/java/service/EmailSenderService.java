package ua.edu.chmnu.network.java.service;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
