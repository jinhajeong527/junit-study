package stub;

import com.example.HelloTest.CalculateService;

public class CalculateServiceStubSingle implements CalculateService {

    @Override
    public int[] retrieveSum() {
        return new int[] {1};
    }
}
