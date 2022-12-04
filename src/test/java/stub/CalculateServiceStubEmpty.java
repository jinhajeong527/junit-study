package stub;

import com.example.HelloTest.CalculateService;

public class CalculateServiceStubEmpty implements CalculateService {
    @Override
    public int[] retrieveSum() {
        return new int[] {};
    }
}
