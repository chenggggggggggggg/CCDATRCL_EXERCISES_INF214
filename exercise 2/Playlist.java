import java.util.LinkedList;

class Playlist {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Summertime Madness");
        Playlist.add("Earned It");
        Playlist.add("Apocalypse");
        Playlist.add("Space Song");
        Playlist.add("Somebody Else");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Almost Is Never Enough");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Woman");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Octro Atardecer");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}