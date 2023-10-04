class SubclassDemo extends AccessModifiersDemo {
    void displayProtectedVar() {
        boolean protectedValue = getProtectedVar();
        System.out.println("Protected Variable Value: " + protectedValue);
    }
}