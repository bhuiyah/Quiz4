/*
 * Phase A <aj33777><mhb2275>
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;

//import java.util.ArrayList;
/**
 * PMap stands for Paired Map. A map is a collection of key-value
 * pairs, e.g., (1, 2) (2, 3) (3, 4) are all pairs with an integer key
 * and an integer value. See the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">
 * java.util.Map documentation</a> for how these methods are supposed
 * to work.
 */
public class PMap {

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */

    private ArrayList<Integer> key;
    private ArrayList<Integer> value;


    public PMap(){
        key = new ArrayList();
        value = new ArrayList();
    }

    public Integer size() {
        // TODO
        return key.size();
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value
     *         mappings
     */
    public boolean isEmpty() {
        // TODO
        if (this.key.size() == 0) {return true};
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param key key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the
     *         specified key
     */
    public boolean containsKey(Integer key) {
        // TODO
        for(int i = 0; i < this.key.size(); i++){
            if(key.get(i) == key){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
    public boolean containsValue(Integer value) {
        // TODO
        for (int i = 0; i < this.value.size(); i++){
            if (value == this.value.get(i)){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code null} if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the
     *         key
     */
    public Integer get(Integer key) {
        // TODO
        if(!containsKey(key)) return null;
        for(int i = 0; i < this.key.size(); i++){
            if(key.get(i) == key){
                return value.get(i);
            }
        }
        return 0;
    }

    /**
     * Associates the specified value with the specified key in this
     * map (optional operation).  If the map previously contained a
     * mapping for the key, the old value is replaced by the specified
     * value.
     *
     * @param key key with which the specified value is to be
     *        associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer put(Integer key, Integer value) {
        // TODO
        Integer val = null;
        if (containsKey(key)){
            val = get(key);
            Integer idx = this.value.indexOf(val);
            this.value.set(idx,value);
        }
        else {
            this.key.add(key);
            this.value.add(value);
        }
        return val;
    }

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).
     *
     * <p>Returns the value to which this map previously associated
     * the key, or <tt>null</tt> if the map contained no mapping for
     * the key.
     *
     * <p>The map will not contain a mapping for the specified key
     * once the call returns.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer remove(Integer key) {
        // TODO
        if(!containsKey(key)) return null;
        returnVal = 0;
        for(int i = 0; i < this.key.size(); i++){
            if(this.key.get(i) == key){
                returnVal = this.value.get(i);
                this.value.remove(i);
                this.key.remove(i);
                return returnVal;
            }
        }
        return 0;
    }

    /**
     * Put all of the mappings from a pair of arrays to this map. Each
     * pair of elements sharing the same index in <tt>keys</tt> and
     * <tt>values</tt> composes a mapping to be stored the map.
     *
     * @param keys the array of keys to be stored in this map
     * @param values the array of values to be stored in this map
     */
    public void putAll(Integer[] keys, Integer[] values) {
        // TODO
        int len = key.size();
        for(int i = 0; i < keys.length(); i++){
            key.add(len + i, keys[i]);
            value.add(len + i, values[i]);
        }
    }

    /**
     * Removes all of the mappings from this map. The map will be
     * empty after this call returns.
     */
    public void clear() {
        // TODO
        key.removeAll(key);
        value.removeAll(value);

    }

    /**
     * Returns an array of the keys contained in this map.
     *
     * @return an array of the keys contained in this map
     */
    public Integer[] keySet() {
        // TODO
        Integer[] list = new Integer[key.size()];
        for(int i = 0; i < key.size(); i++) {
            list[i] = key.get(i);
        }
        return list;
    }

    /**
     * Returns an array of the values contained in this map.
     *
     * @return an array of the values contained in this map
     */
    public Integer[] values() {
        // TODO
        Integer[] val = new Integer[this.values.size()];
        for (int i = 0; i < this.values.size(); i++){
            val[i] = this.values.get(i);
        }
        return val;
    }

    /**
     * Returns an array of the mappings contained in this map.
     *
     * @return an array of the mappings contained in this map
     */
    public PEntry[] entrySet() {
        // TODO
        PEntry[] en = new PEntry[key.size()]
        for(int i = 0; i < this.key.size(); i++){
            en[i].key = this.key.get(i);
            en[i].value = this.value.get(i);
        }
        return en;
    }
}
