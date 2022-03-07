import java.io.File;

// This program will programmatically rename all the files in the same directory.
// workingDirectory: where the files you want to rename are stored.
// You'll also need to populate the rename method to specify how files should be renamed.

public class BulkFileRenamer {

    public static void main(String[] args) {
        File workingDirectory = new File("C:\\Users\\George\\Music\\iTunes\\Music\\Donkey Kong Tropical Freeze");
        File[] files = workingDirectory.listFiles();

        for (File file : files) {
            String oldName = file.getName();
            String newName = rename(oldName);
            File renamed = new File(workingDirectory + "\\" + newName);

            // The first time you run this, maybe comment this line out to test the result.
            file.renameTo(renamed); // this assumes there is not preexisting file with this name

            System.out.println(renamed.getName());
        }
    }

    private static String rename(String oldName) {
        return oldName
                .replace("Donkey Kong Country - Tropical Freeze Soundtrack - ", "")
                .replace("Donkey Kong Country - Tropical Freeze Sountrack - ", "");
    }
}
