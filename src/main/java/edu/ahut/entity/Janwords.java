package edu.ahut.entity;

public class Janwords {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column janwords.id
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column janwords.word
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    private String word;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column janwords.explaintation
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    private String explaintation;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column janwords.id
     *
     * @return the value of janwords.id
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column janwords.id
     *
     * @param id the value for janwords.id
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column janwords.word
     *
     * @return the value of janwords.word
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public String getWord() {
        return word;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column janwords.word
     *
     * @param word the value for janwords.word
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column janwords.explaintation
     *
     * @return the value of janwords.explaintation
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public String getExplaintation() {
        return explaintation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column janwords.explaintation
     *
     * @param explaintation the value for janwords.explaintation
     *
     * @mbg.generated Tue May 08 15:15:35 CST 2018
     */
    public void setExplaintation(String explaintation) {
        this.explaintation = explaintation == null ? null : explaintation.trim();
    }
}