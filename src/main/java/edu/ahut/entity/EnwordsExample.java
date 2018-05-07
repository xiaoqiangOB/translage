package edu.ahut.entity;

import java.util.ArrayList;
import java.util.List;

public class EnwordsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public EnwordsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andSoundmarkIsNull() {
            addCriterion("soundmark is null");
            return (Criteria) this;
        }

        public Criteria andSoundmarkIsNotNull() {
            addCriterion("soundmark is not null");
            return (Criteria) this;
        }

        public Criteria andSoundmarkEqualTo(String value) {
            addCriterion("soundmark =", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkNotEqualTo(String value) {
            addCriterion("soundmark <>", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkGreaterThan(String value) {
            addCriterion("soundmark >", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkGreaterThanOrEqualTo(String value) {
            addCriterion("soundmark >=", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkLessThan(String value) {
            addCriterion("soundmark <", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkLessThanOrEqualTo(String value) {
            addCriterion("soundmark <=", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkLike(String value) {
            addCriterion("soundmark like", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkNotLike(String value) {
            addCriterion("soundmark not like", value, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkIn(List<String> values) {
            addCriterion("soundmark in", values, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkNotIn(List<String> values) {
            addCriterion("soundmark not in", values, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkBetween(String value1, String value2) {
            addCriterion("soundmark between", value1, value2, "soundmark");
            return (Criteria) this;
        }

        public Criteria andSoundmarkNotBetween(String value1, String value2) {
            addCriterion("soundmark not between", value1, value2, "soundmark");
            return (Criteria) this;
        }

        public Criteria andExplaintationIsNull() {
            addCriterion("explaintation is null");
            return (Criteria) this;
        }

        public Criteria andExplaintationIsNotNull() {
            addCriterion("explaintation is not null");
            return (Criteria) this;
        }

        public Criteria andExplaintationEqualTo(String value) {
            addCriterion("explaintation =", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationNotEqualTo(String value) {
            addCriterion("explaintation <>", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationGreaterThan(String value) {
            addCriterion("explaintation >", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationGreaterThanOrEqualTo(String value) {
            addCriterion("explaintation >=", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationLessThan(String value) {
            addCriterion("explaintation <", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationLessThanOrEqualTo(String value) {
            addCriterion("explaintation <=", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationLike(String value) {
            addCriterion("explaintation like", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationNotLike(String value) {
            addCriterion("explaintation not like", value, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationIn(List<String> values) {
            addCriterion("explaintation in", values, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationNotIn(List<String> values) {
            addCriterion("explaintation not in", values, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationBetween(String value1, String value2) {
            addCriterion("explaintation between", value1, value2, "explaintation");
            return (Criteria) this;
        }

        public Criteria andExplaintationNotBetween(String value1, String value2) {
            addCriterion("explaintation not between", value1, value2, "explaintation");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table enwords
     *
     * @mbg.generated do_not_delete_during_merge Mon May 07 15:05:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table enwords
     *
     * @mbg.generated Mon May 07 15:05:51 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}