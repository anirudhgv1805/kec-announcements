import { NavBar } from "./components/NavBar";
import {Routes,Route} from 'react-router-dom';
import { HomePage } from "./pages/HomePage";

export const App : React.FC = () => {
  return(
    <>
      <div>
        <NavBar/>
          <Routes>
            <Route path="/" element={<HomePage/>}/>
            <Route path="/circulars" element={<div>Circulars page</div>}/>
            <Route path="/calendar" element={<div>Calendar page</div>}/>
            <Route path="/notifications" element={<div>Information Notifications page</div>}/>
          </Routes>
      </div>
    </>
  );
}