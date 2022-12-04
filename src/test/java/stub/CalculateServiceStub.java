package stub;

import com.example.HelloTest.CalculateService;

public class CalculateServiceStub implements CalculateService {
    @Override
    public int[] retrieveSum() {
        // 데이터베이스 대신이라고 보면 된다.
        return new int[] {1,2,3};
    }
}
