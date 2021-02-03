package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {DocumentTypeConfiguration.class, DocumentTypeService.class})
class DocumentTypeServiceTest {

    @Autowired
    private DocumentTypeConfiguration documentTypeConfiguration;

    @Value("${test}")
    private String someSrting;

    @Autowired
    private DocumentTypeService documentTypeService;

    @Test
    void testFindDocumentType() {
        String documentType = "Test";
        String result = documentTypeService.getDocumentType(documentType);
        String expected = "this";
        assertEquals(expected, result);
    }

}