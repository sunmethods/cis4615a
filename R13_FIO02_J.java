File file = new File("file");
if (!file.delete()) {
  System.out.println("Deletion failed");
}