package gitlet;

import java.io.File;

/** A debugging class whose main program may be invoked as follows:
 *      java gitlet.DumpObj FILE...
 *  where each FILE is a file produced by Utils.writeObject (or any file
 *  containing a serialized object).  This will simply read FILE,
 *  deserialize it, and call the dump method on the resulting Object.
 *  The object must implement the gitlet.Dumpable interface for this
 *  to work.
 */
public class DumpObj {

    /** Deserialize and apply dump to the contents of each of the files
     *  in FILES. */
    public static void main(String... files) {
        for (String fileName : files) {
            Dumpable obj = Utils.readObject(new File(fileName),
                                            Dumpable.class);
            obj.dump();
            System.out.println("---");
        }
    }
}

