package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;

    public Map getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    private Map additionalHeaders;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    private Credentials credentials;
    private List defaultRecipients;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRedipients=" + defaultRecipients +
                ", additionalHeaders=" + additionalHeaders +
                ", credentials=" + " username: " + credentials.getUsername() + "password:"
                + credentials.getPassword() + "authMethod:" + credentials.getAuthMethod()+
                '}';
    }
}
