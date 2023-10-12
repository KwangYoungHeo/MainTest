import './App.css';
import axios from 'axios'
function App() {

  const test = async () => {
    const url = 'http://localhost:8090/springtest/test.do'
    await axios.get(url)
    .then((res)=>{
      console.log(res.data);
    })
    .catch((err)=>{
      console.log(err);
      
    })
  }

  return (
    <div>
      <h1>안녕하세요 테스트입니다.</h1>
      <p>아래 버튼을 클릭해보세요!</p>
      <button onClick={test}>클릭</button>
    </div>
  );
}

export default App;
