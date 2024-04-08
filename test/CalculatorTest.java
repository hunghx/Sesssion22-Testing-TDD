import org.junit.jupiter.api.*;



@DisplayName("Calculater-test-unit")
class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @BeforeAll // 1
    static void beforeAll() {
        System.out.println(" thuc thi truoc tat ca ca kiem thu : beforeAll ");
    }

    @BeforeEach // 2
    public void beforeEach() {
        System.out.println(" thuc thi truoc moi ca kiem thu : beforeEach");
    }

    @AfterAll // 1
    static void afterAll() {
        System.out.println(" thuc thi sau tat ca kiem thu : afterAll");
    }

    @AfterEach // 2
    public void afterEach() {
        System.out.println(" thuc thi sau moi ca kiem thu : afterEach()");
    }


    @Test// chu thich day la 1 test method
    @DisplayName("tinh tong 1 va 2")
    void sum1and2() {
        System.out.println("Thuc thi ca kiem thu tinh tong");
        // thuc hien tinh tong
        double sum = calculator.sum(1, 2);
        System.out.println(sum);

        double actual = sum;
        double expected = 3.0;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    @DisplayName("tinh tong 4 va 5")
    @Disabled
    void sum4and5(){
        System.out.println("Thuc thi ca kiem thu tinh tong");
        Calculator calculator = new Calculator();

        // thuc hien tinh tong
        double sum = calculator.sum(4, 5);
        System.out.println(sum);
    }
    @Test
    @DisplayName("tinh tong 7 va 8")
    void sum7and8(){
        Assertions.assertEquals(16,calculator.sum(7,8));
    }
}