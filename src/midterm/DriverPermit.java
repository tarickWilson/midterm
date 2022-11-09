

package midterm;

/**
 * This class +++ Insert class description here+++
 * @author Mehrdad Iravani
 */
public class DriverPermit {

    private String permitNumber;
    private String permitCategory;
    enum categories {G1, G2, G, M , Tarick_CATEGORY}

    /**
     * This method checks whether the format of the provided Driver's Permit is valid or not. Assume that the
     * format of a valid permit is 'FOUR_CHARACTERS' + 'FIVE_DIGITS'. Example: ABCD12345
     *
     * @param permit the driver's permit.
     * @return the method returns true if the format of the permit is valid.
     */
    public boolean isValid(String permit) {
        
        boolean isValidPermit = true; // assume valid
        int validPermitLength = 9; // Number of letters+digits on a valid permit;
        
        if (permit.length() == validPermitLength) {
            for (int i = 0; i <  permit.length(); i++) {
                if (i < 4) {
                    // check for characters
                    if (!Character.isLetter(permit.charAt(i))) {
                        isValidPermit = false;
                        break; // not valid, so break out
                    }
                } else {
                    // i >= 4; now check for digits
                    if (!Character.isDigit(permit.charAt(i))) {
                        isValidPermit = false;
                        break; // not valid, so break out
                    }
                }
            }
        } else {
            // bad length
            isValidPermit = false;
        }
        return isValidPermit;
    }

    /**
     * A getter method that returns permit number.
     *
     * @return the permitNumber
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * A setter method to sets the permit number
     *
     * @param permitNumber the permitNumber to set
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /**
     * A getter method to return category of the permit.
     *
     * @return the permitCategory
     */
    public String getPermitCategory() {
        return permitCategory;
    }

    /**
     * A setter method to set the category of the permit.
     *
     * @param permitCategory the permitCategory to set
     */
    public void setPermitCategory(String permitCategory) {
        this.permitCategory = permitCategory;
    }
}

