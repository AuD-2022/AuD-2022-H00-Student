package h00;

import org.jetbrains.annotations.Nullable;

/**
 * This class represents a member of a linked list, which stores a value in {@link #key} and a reference to the next member
 * (or {@code null} if this is the last member in this list) in {@link #next}.
 *
 * @param <T> type of value stored in {@link #key}
 */
public class ListItem<T> {

    /**
     * The value stored in this member of a list.
     */
    public @Nullable T key;

    /**
     * A reference to the next member in this list (or {@code null} if this member is the last element in this list).
     */
    public @Nullable ListItem<T> next;

    /**
     * Empty constructor for creating a new {@link ListItem} object.
     * Does nothing, but must not be removed!
     */
    public ListItem() {

    }

    @Override
    public String toString() {
        throw new RuntimeException("H1 - not implemented"); // TODO: H1 - remove if implemented
    }
}
