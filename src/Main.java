public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo demoInstance = new AccessModifiersDemo();

        demoInstance.privateVar = 20;
        demoInstance.defaultVar = 30.5;
        demoInstance.protectedVar = true;
        demoInstance.publicVar = "Hello, World!";

        System.out.println("Private Variable Value: " + demoInstance.getPrivateVar());
        System.out.println("Default Variable Value: " + demoInstance.getDefaultVar());
        System.out.println("Protected Variable Value: " + demoInstance.getProtectedVar());
        System.out.println("Public Variable Value: " + demoInstance.getPublicVar());

        SubclassDemo subDemoInstance = new SubclassDemo();
        subDemoInstance.displayProtectedVar();
    }
}