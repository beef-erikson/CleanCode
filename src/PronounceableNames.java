/*
 *  Use pronounceable names in your code.
 */

import java.util.Date;

public class PronounceableNames {
}

// Consider the difference between these two classes.
class DtaRcrd102 {
    private Date genymdhms;
    private Date modymdhms;
    private final String pszqint = "102";
    /* ... */
}

class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
    /* ... */
}