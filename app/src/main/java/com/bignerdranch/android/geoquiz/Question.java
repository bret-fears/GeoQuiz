package com.bignerdranch.android.geoquiz;

/**
 * Created by bretfears on 8/15/16.
 */
public class Question {

    private int mTextAnswerTrue;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextAnswerTrue = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextAnswerTrue() {
        return mTextAnswerTrue;
    }

    public void setTextAnswerTrue(int textAnswerTrue) {
        mTextAnswerTrue = textAnswerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
