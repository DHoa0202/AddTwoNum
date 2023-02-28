package test;

import com.MyBigNumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestAddTwoNums {

    private final String stn1;
    private final String stn2;
    private final String result;
    private final Boolean isSuccess;

    public TestAddTwoNums(Object stn1, Object stn2, Object result, Object isSuccess) {
        this.stn1 = String.valueOf(stn1);
        this.stn2 = String.valueOf(stn2);
        this.result = String.valueOf(result);
        this.isSuccess = Boolean.valueOf(String.valueOf(isSuccess));
    }

    @Test
    public void test() {
        String res = MyBigNumber.sum(stn1, stn2);

        if (isSuccess) Assert.assertEquals(result, res);
        else Assert.assertNotEquals(result, res);
    }

    @Parameters // Chuan bi du lieu
    public static Iterable<Object[]> prepareData() {
        return TestData.data;
    }
}
