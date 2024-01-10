package com.example.ApiTestingTool.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class ApiBody {

    @Id
    private int id;
    private String url;
    private String method;
    private String headers;
   
    private String body;

    private String validation;
    public String getTestScript() {
        return testScript;
    }
    public void setTestScript(String testScript) {
        this.testScript = testScript;
    }
    private String testScript;
    private String row_num;
    

    
    public String getRow_num() {
        return row_num;
    }
    public void setRow_num(String row_num) {
        this.row_num = row_num;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getHeaders() {
        return headers;
    }
    public void setHeaders(String headers) {
        this.headers = headers;
    }
    public String getValidation() {
        return validation;
    }
    public void setValidation(String validation) {
        this.validation = validation;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

   

}
