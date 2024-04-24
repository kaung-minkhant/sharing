const express = require('express')

const PORT = 8000;

const app = express();

app.get("/", (req, res) => {
  return res.status(200).send('Hello world from node server\n');
})

app.listen(PORT, () => {
  console.log("Server is listening on PORT " + PORT);
})
