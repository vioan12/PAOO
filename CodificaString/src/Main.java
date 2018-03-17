public class Main
{
    private static Simulator simulator;
    public static void main(String[] args)
    {
        simulator = new Simulator();
        try {
            simulator.read();
            simulator.simulate();
            simulator.write();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
