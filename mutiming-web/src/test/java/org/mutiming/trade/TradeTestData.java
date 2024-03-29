package org.mutiming.trade;

class TradeTestData {
    // Positive cases
    static final String NO_DISCOUNT_TOTAL_200 = "[\"001\",\"001\"]";
    static final String DISCOUNT_3_FOR_200 = "[\"001\",\"001\",\"001\"]";
    static final String DISCOUNT_TOTAL_300 = "[\"001\",\"001\",\"001\",\"001\"]";
    static final String DISCOUNT_TOTAL_600 = "[\"001\",\"001\",\"001\",\"001\",\"001\",\"001\",\"001\",\"001\"]";
    static final String WATCH_002_1_FOR_80 = "[\"002\"]";
    static final String WATCH_002_DISCOUNT_2_FOR_120 = "[\"002\",\"002\"]";
    static final String WATCH_002_3_TOTAL_200 = "[\"002\",\"002\",\"002\"]";
    static final String MULTIPLE_CATEGORY_NO_DISCOUNT_TOTAL_330 = "[\"001\",\"002\",\"001\",\"003\"]";
    static final String MULTIPLE_CATEGORY_DISCOUNT_TOTAL_320 = "[\"002\",\"001\",\"002\",\"001\",\"001\"]";
    static final String WATCH_003_1_FOR_50 = "[\"003\"]";
    static final String WATCH_003_4_FOR_200 = "[\"003\",\"003\",\"003\",\"003\"]";
    static final String WATCH_004_1_FOR_30 = "[\"004\"]";
    static final String WATCH_004_10_FOR_300 = "[\"004\",\"004\",\"004\",\"004\",\"004\",\"004\",\"004\",\"004\",\"004\",\"004\"]";

    // id with redundant spaces
    static final String SPACE_BEFORE_WATCH_002_1_FOR_80 = "[\" 002\"]";
    static final String SPACE_AFTER_WATCH_002_1_FOR_80 = "[\"002 \"]";
    static final String SPACE_BEFORE_AND_AFTER_WATCH_002_1_FOR_80 = "[\" 002 \"]";

    // negative cases
    static final String EMPTY_LIST_TOTAL_0 = "[]";
    static final String EMPTY_ID_TOTAL_0 = "[\"\"]";
    static final String BLANK_ID_TOTAL_0 = "[\" \"]";
    static final String ID_NOT_FOUND_1 = "[\"002\",\"000\",\"001\",\"001\"]";
    static final String ID_NOT_FOUND_2 = "[\"002\",\"001\",\"1\",\"001\"]";
    static final String ID_NOT_FOUND_3 = "[\"002\",\"02\"]";
    static final String ID_NOT_FOUND_4 = "[\"005\",\"001\"]";
    static final String ID_NOT_FOUND_SPACE_ITHE_MIDDLE = "[\"00 1\"]";

}
