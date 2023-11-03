package org.custard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailStructure {
    private String subject;
    private String message;
    private String recipient;
}
