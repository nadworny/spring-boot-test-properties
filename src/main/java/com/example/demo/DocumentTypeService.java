package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentTypeService {

    @Autowired
    private DocumentTypeConfiguration documentTypeConfiguration;

    public String getDocumentType(String documentType) {
        return null;
    }
}
