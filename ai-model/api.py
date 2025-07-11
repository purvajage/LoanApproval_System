from flask import Flask, request, jsonify
import joblib
import numpy as np

app = Flask(__name__)
model = joblib.load("model.pkl")

# route for predict
@app.route("/predict", methods=["POST"])
def predict():
    data = request.get_json()
    features = [
        data["Gender"], data["Married"], data["Dependents"], data["Education"],
        data["Self_Employed"], data["ApplicantIncome"], data["CoapplicantIncome"],
        data["LoanAmount"], data["Loan_Amount_Term"], data["Credit_History"],
        data["Property_Area"]
    ]
    prediction = model.predict([features])[0]
    return jsonify({"loan_approved": bool(prediction)})

if __name__ == "__main__":
    app.run(port=5000)
