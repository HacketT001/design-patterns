package com.company;

public class ComplexView {
    private boolean firstButton;
    private boolean secondButton;
    private boolean webView;
    private boolean checkBox;

    public static Builder getBuilder() {
        return new ComplexView().new Builder();
    }

    class Builder {

        public ComplexView build() {
            return ComplexView.this;
        }

        public Builder buildFirstButton(boolean var) {
            ComplexView.this.firstButton = var;
            return this;
        }

        public Builder buildSecondButton(boolean var) {
            ComplexView.this.secondButton = var;
            return this;
        }

        public Builder buildWebView(boolean var) {
            ComplexView.this.webView = var;
            return this;
        }

        public Builder buildcheckBox(boolean var) {
            ComplexView.this.checkBox = var;
            return this;
        }
    }
}
