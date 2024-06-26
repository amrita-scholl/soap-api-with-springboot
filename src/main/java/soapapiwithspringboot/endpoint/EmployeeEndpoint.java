package soapapiwithspringboot.endpoint;

import localhost._8010.soap_api_with_springboot.GetEmployeeRequest;
import localhost._8010.soap_api_with_springboot.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soapapiwithspringboot.repository.EmployeeRepository;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE_URI = "http://localhost:8010/soap_api_with_springboot";

    private final EmployeeRepository empRepository;

    @Autowired
    public EmployeeEndpoint(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
    @ResponsePayload
    public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
        GetEmployeeResponse response = new GetEmployeeResponse();
        response.setEmployee(empRepository.findEmployee(request.getId()));

        return response;
    }
}