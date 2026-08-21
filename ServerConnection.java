class ServerConnection {

    String ipAddress;

    ServerConnection(String ipAddress) {
        this.ipAddress = ipAddress;
        System.out.println("Connection opened to " + ipAddress);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Connection closed for " + ipAddress + ". Memory freed.");
    }

    public static void main(String[] args) {

        ServerConnection connection = new ServerConnection("192.168.1.10");

        connection = null;

        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
